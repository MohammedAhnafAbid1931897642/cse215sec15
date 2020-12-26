/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.assignment.pkg3;
import java.util.Scanner;
import java.lang.Integer;
/**
 *
 * @author ahnaf
 */
public class ProgrammingAssignment3{
    static Scanner inp=new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FrontEndDev f= new FrontEndDev();
        BackEndDev b=new BackEndDev();
        
        System.out.println("For FrontEndDev, enter name, id, salary, working_since, scrum_master (in boolean), team_leader: ");
        String name=inp.nextLine();
        int id=inp.nextInt();
        Double salary=inp.nextDouble();
        String working_since=inp.nextLine();
        //boolean scrum_master=inp.nextBoolean();
        String team_leader=inp.nextLine();
        
        f.name=name;
        f.id=id;
        f.salary=salary;
        f.working_since=working_since;
        //f.scrum_master=scrum_master;
        f.team_leader=team_leader;
        
        DBA d=new DBA();
        Employees e=new Employees();
        
        System.out.println("Enter email id: ");
        String email=inp.nextLine();
        e.setEmail(email);
        System.out.println(e.getEmail());
        System.out.println("Email verified? ");
        System.out.println(e.verifyEmail(email));
        
        System.out.println("For DBA, Enter project name and query language and number of team members: ");
        String proname=inp.nextLine();
        String query=inp.nextLine();
        int team_members=inp.nextInt();
        
        d.project_name=proname;
        d.query_language=query;
        d.team_members=team_members;
        
        
        d.printEmploymentYears(working_since);
        d.assignProject(proname,team_members, query);
        d.printAssignedProject();
        e.printStatus();
        
        System.out.println("For BackEndDev, Enter project name, server side framework and no of team members: ");
        
        String project_name=inp.nextLine();
        String server_side_framework=inp.nextLine();
        int team_membersb=inp.nextInt();
        
        b.project_name=project_name;
        b.server_side_framework=server_side_framework;
        b.team_members=team_membersb;
       
        b.assignProject(project_name, team_members, server_side_framework);
        b.printAssignedProject();
    }
    
}
