/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.assignment.pkg3;
//declaring class BackEndDev
import java.util.Calendar;

/**
 *
 * @author ahnaf
 */
public class DBA extends Employees{
    
    
    private String project_name;
    private int team_members;
    private String query_language;
    public String working_since;
    
    public DBA(String name, int id, double salary, String working_since){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.working_since=working_since;
        
      
        
    }
    
    void printEmploymentYears(String working_since){
        int i= Integer.parseInt(working_since);
        //finding integer value of current year
        int currentyear= Calendar.getInstance().get(Calendar.YEAR);
        int years=currentyear-i;
        System.out.println("Employed for: " + years + " years.");
        
    }
    
    void assignProject(String project_name, int team_members, String query_language){
        this.project_name=project_name;
        this.team_members=team_members;
        this.query_language=query_language;
        
        
    }
    
    void printAssignedProject(){
        System.out.println("Project name: " + project_name+ " No. of team members: " + team_members + " Server side framework: " + query_language);
    }
    
    

 
    
}
