
public class AlunoGrad {
    private MateriasGrad soliciMatGrad;
    AlunoGrad(MateriasGrad smg){
        setSMG(smg);
    }
    void setSMG(MateriasGrad smg){ this.soliciMatGrad=smg;}
    MateriasGrad getSMG(){ return this.soliciMatGrad;}
}
