
public class AlunoPos extends MateriasGrad{
    private MateriasPosGrad soliciMatPosGrad;
    public AlunoPos(String x,MateriasPosGrad smpg){
        super(x);
        
    }
    
    void setSMpG(MateriasPosGrad smpg){ this.soliciMatPosGrad=smpg;}
    MateriasPosGrad getSMPG(){ return this.soliciMatPosGrad;}
    
}
