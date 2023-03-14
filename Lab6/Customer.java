package Lab6;


class Customer implements Canpay{
    private String name;
    private MemberType memberType;

    public Customer(String name) {
        this.name = name;
        memberType = MemberType.None;
    }

    public void spend(int direction){ //รับคะแนน
        if(direction > 0){
            promoteMemberType();
        }else{
            demoteMemberType();
        }
        showMembershipStatus();
    }

    private void promoteMemberType(){ //เพื่มระดับสมาชิก
        if(memberType.ordinal()  == 0){
            memberType = MemberType.SILVER;
        }else if(memberType.ordinal()  == 1){
            memberType = MemberType.GOLD;
        }else if(memberType.ordinal() == 2){
            memberType = MemberType.PREMIUM;
        }
    }

    private void demoteMemberType(){ //ลดระดับสมาชิก
        if(memberType.ordinal() == 3){
            memberType = MemberType.GOLD;
        }else if(memberType.ordinal() == 2){
            memberType = MemberType.SILVER;
        }   
    }

    public void showMembershipStatus(){ //แสดงสถานะสมาชิก
        System.out.println("You are now "+memberType);
    }

}
