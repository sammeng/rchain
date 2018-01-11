package rholang.parsing.delimc.Absyn; // Java Package generated by the BNF Converter.

public abstract class Expr implements java.io.Serializable {
  public abstract <R,A> R accept(Expr.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(rholang.parsing.delimc.Absyn.EVar p, A arg);
    public R visit(rholang.parsing.delimc.Absyn.EVal p, A arg);
    public R visit(rholang.parsing.delimc.Absyn.EAbs p, A arg);
    public R visit(rholang.parsing.delimc.Absyn.EApp p, A arg);
    public R visit(rholang.parsing.delimc.Absyn.EReturn p, A arg);
    public R visit(rholang.parsing.delimc.Absyn.EBind p, A arg);
    public R visit(rholang.parsing.delimc.Absyn.ENewPrompt p, A arg);
    public R visit(rholang.parsing.delimc.Absyn.EPushPrompt p, A arg);
    public R visit(rholang.parsing.delimc.Absyn.EWithSubCont p, A arg);
    public R visit(rholang.parsing.delimc.Absyn.EPushSubCont p, A arg);
    public R visit(rholang.parsing.delimc.Absyn.ETuple p, A arg);

  }

}
