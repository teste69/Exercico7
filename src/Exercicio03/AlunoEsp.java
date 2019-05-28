
public class AlunoEsp extends AlunoGrad{
    private MateriasPosGrad soliciMatPosGrad;
    public AlunoEsp(MateriasGrad smg,MateriasPosGrad smpg){
        super(smg);
        setSMPG(smpg);
    }
    
    void setSMPG(MateriasPosGrad smpg){ this.soliciMatPosGrad=smpg;}
    MateriasPosGrad getSMPG(){ return this.soliciMatPosGrad;}
    
}
