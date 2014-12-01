package info.sigterm.deob.attributes.code;

import info.sigterm.deob.attributes.code.instructions.ALoad;
import info.sigterm.deob.attributes.code.instructions.ANewArray;
import info.sigterm.deob.attributes.code.instructions.AStore;
import info.sigterm.deob.attributes.code.instructions.BiPush;
import info.sigterm.deob.attributes.code.instructions.Branch;
import info.sigterm.deob.attributes.code.instructions.CheckCast;
import info.sigterm.deob.attributes.code.instructions.DLoad;
import info.sigterm.deob.attributes.code.instructions.DStore;
import info.sigterm.deob.attributes.code.instructions.FLoad;
import info.sigterm.deob.attributes.code.instructions.FStore;
import info.sigterm.deob.attributes.code.instructions.GetField;
import info.sigterm.deob.attributes.code.instructions.GetStatic;
import info.sigterm.deob.attributes.code.instructions.GotoW;
import info.sigterm.deob.attributes.code.instructions.IInc;
import info.sigterm.deob.attributes.code.instructions.ILoad;
import info.sigterm.deob.attributes.code.instructions.IStore;
import info.sigterm.deob.attributes.code.instructions.IfNonNull;
import info.sigterm.deob.attributes.code.instructions.IfNull;
import info.sigterm.deob.attributes.code.instructions.InstanceOf;
import info.sigterm.deob.attributes.code.instructions.InvokeDynamic;
import info.sigterm.deob.attributes.code.instructions.InvokeInterface;
import info.sigterm.deob.attributes.code.instructions.InvokeSpecial;
import info.sigterm.deob.attributes.code.instructions.InvokeStatic;
import info.sigterm.deob.attributes.code.instructions.InvokeVirtual;
import info.sigterm.deob.attributes.code.instructions.JSR_W;
import info.sigterm.deob.attributes.code.instructions.LDC;
import info.sigterm.deob.attributes.code.instructions.LDC2_W;
import info.sigterm.deob.attributes.code.instructions.LDC_W;
import info.sigterm.deob.attributes.code.instructions.LLoad;
import info.sigterm.deob.attributes.code.instructions.LStore;
import info.sigterm.deob.attributes.code.instructions.LookupSwitch;
import info.sigterm.deob.attributes.code.instructions.MultiANewArray;
import info.sigterm.deob.attributes.code.instructions.New;
import info.sigterm.deob.attributes.code.instructions.NewArray;
import info.sigterm.deob.attributes.code.instructions.PutField;
import info.sigterm.deob.attributes.code.instructions.PutStatic;
import info.sigterm.deob.attributes.code.instructions.Ret;
import info.sigterm.deob.attributes.code.instructions.SiPush;
import info.sigterm.deob.attributes.code.instructions.TableSwitch;
import info.sigterm.deob.attributes.code.instructions.Wide;

public enum InstructionType
{
	NOP(0x00, "nop", Instruction.class),
	ACONST_NULL(0x01, "aconst_null", Instruction.class),
	ICONST_M1(0x02, "iconst_m1", Instruction.class),
	ICONST_0(0x03, "iconst_0", Instruction.class),
	ICONST_1(0x04, "iconst_1", Instruction.class),
	ICONST_2(0x05, "iconst_2", Instruction.class),
	ICONST_3(0x06, "iconst_3", Instruction.class),
	ICONST_4(0x07, "iconst_4", Instruction.class),
	ICONST_5(0x08, "iconst_5", Instruction.class),
	LCONST_0(0x09, "lconst_0", Instruction.class),
	LCONST_1(0x0a, "lconst_1", Instruction.class),
	FCONST_0(0x0b, "fconst_0", Instruction.class),
	FCONST_1(0x0c, "fconst_1", Instruction.class),
	FCONST_2(0x0d, "fconst_2", Instruction.class),
	DCONST_0(0x0e, "dconst_0", Instruction.class),
	DCONST_1(0x0f, "dconst_1", Instruction.class),
	BIPUSH(0x10, "bipush", BiPush.class),
	SIPUSH(0x11, "sipush", SiPush.class),
	LDC(0x12, "ldc", LDC.class),
	LDC_W(0x13, "lcd_w", LDC_W.class),
	LDC2_W(0x14, "ldc2_w", LDC2_W.class),
	ILOAD(0x15, "iload", ILoad.class),
	LLOAD(0x16, "lload", LLoad.class),
	FLOAD(0x17, "fload", FLoad.class),
	DLOAD(0x18, "dload", DLoad.class),
	ALOAD(0x19, "aload", ALoad.class),
	ILOAD_0(0x1a, "iload_0", Instruction.class),
	ILOAD_1(0x1b, "iload_1", Instruction.class),
	ILOAD_2(0x1c, "iload_2", Instruction.class),
	ILOAD_3(0x1d, "iload_3", Instruction.class),
	LLOAD_0(0x1e, "lload_0", Instruction.class),
	LLOAD_1(0x1f, "lload_1", Instruction.class),
	LLOAD_2(0x20, "lload_2", Instruction.class),
	LLOAD_3(0x21, "lload_3", Instruction.class),
	FLOAD_0(0x22, "fload_0", Instruction.class),
	FLOAD_1(0x23, "fload_1", Instruction.class),
	FLOAD_2(0x24, "fload_2", Instruction.class),
	FLOAD_3(0x25, "fload_3", Instruction.class),
	DLOAD_0(0x26, "dload_0", Instruction.class),
	DLOAD_1(0x27, "dload_1", Instruction.class),
	DLOAD_2(0x28, "dload_2", Instruction.class),
	DLOAD_3(0x29, "dload_3", Instruction.class),
	ALOAD_0(0x2a, "aload_0", Instruction.class),
	ALOAD_1(0x2b, "aload_1", Instruction.class),
	ALOAD_2(0x2c, "aload_2", Instruction.class),
	ALOAD_3(0x2d, "aload_3", Instruction.class),
	IALOAD(0x2e, "iaload", Instruction.class),
	LALOAD(0x2f, "laload", Instruction.class),
	FALOAD(0x30, "faload", Instruction.class),
	DALOAD(0x31, "daload", Instruction.class),
	AALOAD(0x32, "aaload", Instruction.class),
	BALOAD(0x33, "baload", Instruction.class),
	CALOAD(0x34, "caload", Instruction.class),
	SALOAD(0x35, "saload", Instruction.class),
	ISTORE(0x36, "istore", IStore.class),
	LSTORE(0x37, "lstore", LStore.class),
	FSTORE(0x38, "fstore", FStore.class),
	DSTORE(0x39, "dstore", DStore.class),
	ASTORE(0x3a, "astore", AStore.class),
	ISTORE_0(0x3b, "istore_0", Instruction.class),
	ISTORE_1(0x3c, "istore_1", Instruction.class),
	ISTORE_2(0x3d, "istore_2", Instruction.class),
	ISTORE_3(0x3e, "istore_3", Instruction.class),
	LSTORE_0(0x3f, "lstore_0", Instruction.class),
	LSTORE_1(0x40, "lstore_1", Instruction.class),
	LSTORE_2(0x41, "lstore_2", Instruction.class),
	LSTORE_3(0x42, "lstore_3", Instruction.class),
	FSTORE_0(0x43, "fstore_0", Instruction.class),
	FSTORE_1(0x44, "fstore_1", Instruction.class),
	FSTORE_2(0x45, "fstore_2", Instruction.class),
	FSTORE_3(0x46, "fstore_3", Instruction.class),
	DST0RE_0(0x47, "dstore_0", Instruction.class),
	DSTORE_1(0x48, "dstore_1", Instruction.class),
	DSTORE_2(0x49, "dstore_2", Instruction.class),
	DSTORE_3(0x4a, "dstore_3", Instruction.class),
	ASTORE_0(0x4b, "astore_0", Instruction.class),
	ASTORE_1(0x4c, "astore_1", Instruction.class),
	ASTORE_2(0x4d, "astore_2", Instruction.class),
	ASTORE_3(0x4e, "astore_3", Instruction.class),
	IASTORE(0x4f, "iastore", Instruction.class),
	LASTORE(0x50, "lastore", Instruction.class),
	FASTORE(0x51, "fastore", Instruction.class),
	DASTORE(0x52, "dastore", Instruction.class),
	AASTORE(0x53, "aastore", Instruction.class),
	BASTORE(0x54, "bastore", Instruction.class),
	CASTORE(0x55, "castore", Instruction.class),
	SASTORE(0x56, "sastore", Instruction.class),
	POP(0x57, "pop", Instruction.class),
	POP2(0x58, "pop2", Instruction.class),
	DUP(0x59, "dup", Instruction.class),
	DUP_X1(0x5a, "dup_x1", Instruction.class),
	DUP_X2(0x5b, "dup_x2", Instruction.class),
	DUP2(0x5c, "dup2", Instruction.class),
	DUP2_X1(0x5d, "dup2_x1", Instruction.class),
	DUP2_X2(0x5e, "dup2_x2", Instruction.class),
	SWAP(0x5f, "swap", Instruction.class),
	IADD(0x60, "iadd", Instruction.class),
	LADD(0x61, "ladd", Instruction.class),
	FADD(0x62, "fadd", Instruction.class),
	DADD(0x63, "dadd", Instruction.class),
	ISUB(0x64, "isub", Instruction.class),
	LSUB(0x65, "lsub", Instruction.class),
	FSUB(0x66, "fsub", Instruction.class),
	DSUB(0x67, "dsub", Instruction.class),
	IMUL(0x68, "imul", Instruction.class),
	LMUL(0x69, "lmul", Instruction.class),
	FMUL(0x6a, "fmul", Instruction.class),
	DMUL(0x6b, "dmul", Instruction.class),
	IDIV(0x6c, "idiv", Instruction.class),
	LDIV(0x6d, "ldiv", Instruction.class),
	FDIV(0x6e, "fdiv", Instruction.class),
	DDIV(0x6f, "ddiv", Instruction.class),
	IREM(0x70, "irem", Instruction.class),
	LREM(0x71, "lrem", Instruction.class),
	FREM(0x72, "frem", Instruction.class),
	DREM(0x73, "drem", Instruction.class),
	INEG(0x74, "ineg", Instruction.class),
	LNEG(0x75, "lneg", Instruction.class),
	FNEG(0x76, "fneg", Instruction.class),
	DNEG(0x77, "dneg", Instruction.class),
	ISHL(0x78, "ishl", Instruction.class),
	LSHL(0x79, "lshl", Instruction.class),
	ISHR(0x7a, "ishr", Instruction.class),
	LSHR(0x7b, "lshr", Instruction.class),
	IUSHR(0x7c, "iushr", Instruction.class),
	LUSHR(0x7d, "lushr", Instruction.class),
	IAND(0x7e, "iand", Instruction.class),
	LAND(0x7f, "land", Instruction.class),
	IOR(0x80, "ior", Instruction.class),
	LOR(0x81, "lor", Instruction.class),
	IXOR(0x82, "ixor", Instruction.class),
	LXOR(0x83, "lxor", Instruction.class),
	IINC(0x84, "iinc", IInc.class),
	I2L(0x85, "i2l", Instruction.class),
	I2F(0x86, "i2f", Instruction.class),
	I2D(0x87, "i2d", Instruction.class),
	L2I(0x88, "l2i", Instruction.class),
	L2F(0x89, "l2f", Instruction.class),
	L2D(0x8a, "l2d", Instruction.class),
	F2I(0x8b, "f2i", Instruction.class),
	F2L(0x8c, "f2l", Instruction.class),
	F2D(0x8d, "f2d", Instruction.class),
	D2I(0x8e, "d2i", Instruction.class),
	D2L(0x8f, "d2l", Instruction.class),
	D2F(0x90, "d2f", Instruction.class),
	I2B(0x91, "i2b", Instruction.class),
	I2C(0x92, "i2c", Instruction.class),
	I2S(0x93, "i2s", Instruction.class),
	LCMP(0x94, "lcmp", Instruction.class),
	FCMPL(0x95, "fcmpl", Instruction.class),
	FCMPG(0x96, "fcmpg", Instruction.class),
	DCMPL(0x97, "dcmpl", Instruction.class),
	DCMPG(0x98, "dcmpg", Instruction.class),
	IFEQ(0x99, "ifeq", Branch.class),
	IFNE(0x9a, "ifne", Branch.class),
	IFLT(0x9b, "iflt", Branch.class),
	IFGE(0x9c, "ifge", Branch.class),
	IFGT(0x9d, "ifgt", Branch.class),
	IFLE(0x9e, "ifle", Branch.class),
	IF_ICMPEQ(0x9f, "if_icmpeq", Branch.class),
	IF_ICMPNE(0xa0, "if_icmpne", Branch.class),
	IF_ICMPLT(0xa1, "if_cmplt", Branch.class),
	IF_CMPGE(0xa2, "if_cmpge", Branch.class),
	IF_CMPGT(0xa3, "if_cmpgt", Branch.class),
	IF_CMPLE(0xa4, "if_cmple", Branch.class),
	IF_ACMPEQ(0xa5, "if_acmpeq", Branch.class),
	IF_ACMPNE(0xa6, "if_acmpne", Branch.class),
	GOTO(0xa7, "goto", Branch.class),
	JSR(0xa8, "jsr", Branch.class),
	RET(0xa9, "ret", Ret.class),
	TABLESWITCH(0xaa, "tableswitch", TableSwitch.class),
	LOOKUPSWITCH(0xab, "lookupswitch", LookupSwitch.class),
	IRETURN(0xac, "ireturn", Instruction.class),
	LRETURN(0xad, "lreturn", Instruction.class),
	FRETURN(0xae, "freturn", Instruction.class),
	DRETURN(0xaf, "dreturn", Instruction.class),
	ARETURN(0xb0, "areturn", Instruction.class),
	RETURN(0xb1, "return", Instruction.class),
	GETSTATIC(0xb2, "getstatic", GetStatic.class),
	PUTSTATIC(0xb3, "putstatic", PutStatic.class),
	GETFIELD(0xb4, "getfield", GetField.class),
	PUTFIELD(0xb5, "putfield", PutField.class),
	INVOKEVIRTUAL(0xb6, "invokevirtual", InvokeVirtual.class),
	INVOKESPECIAL(0xb7, "invokespecial", InvokeSpecial.class),
	INVOKESTATIC(0xb8, "invokestatic", InvokeStatic.class),
	INVOKEINTERFACE(0xb9, "invokeinterface", InvokeInterface.class),
	INVOKEDYNAMIC(0xba, "invokedynamic", InvokeDynamic.class),
	NEW(0xbb, "new", New.class),
	NEWARRAY(0xbc, "newarray", NewArray.class),
	ANEWARRAY(0xbd, "anewarray", ANewArray.class),
	ARRAYLENGTH(0xbe, "arraylength", Instruction.class),
	ATHROW(0xbf, "athrow", Instruction.class),
	CHECKCAST(0xc0, "checkcast", CheckCast.class),
	INSTANCEOf(0xc1, "instanceof", InstanceOf.class),
	MONITORENTER(0xc2, "monitorenter", Instruction.class),
	MONITOREXIT(0xc3, "monitorexit", Instruction.class),
	WIDE(0xc4, "wide", Wide.class),
	MULTIANEWARRAY(0xc5, "multianewarray", MultiANewArray.class),
	IFNULL(0xc6, "ifnull", IfNull.class),
	IFNONNULL(0xc7, "ifnonnull", IfNonNull.class),
	GOTO_W(0xc8, "goto_w", GotoW.class),
	JSR_W(0xc9, "jsr_w", JSR_W.class),
	BREAKPOINT(0xca, "breakpoint", Instruction.class);

	private byte code;
	private String name;
	private Class<? extends Instruction> clazz;

	InstructionType(int op, String name, Class<? extends Instruction> clazz)
	{
		this.code = (byte) op;
		this.name = name;
		this.clazz = clazz;
	}

	public byte getCode()
	{
		return code;
	}

	public String getName()
	{
		return name;
	}

	public Class<? extends Instruction> getInstructionClass()
	{
		return clazz;
	}

	public static InstructionType findInstructionFromCode(byte code)
	{
		for (InstructionType t : InstructionType.values())
			if (t.getCode() == code)
				return t;
		return null;
	}
}
