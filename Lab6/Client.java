package Lab6;


class Client implements Canpay{
    private String name;
    private MemberTypeWithDiscount memberType;

    public Client(String name) {
        this.name = name;
        memberType =  MemberTypeWithDiscount.NONE;
    }

    @Override
    public void spend(int direction){ //รับคะแนน
        if(direction > 0){
            promoteMemberType();
        }else{
            demoteMemberType();
        }
        showMembershipStatus();
    }

    private void promoteMemberType(){ //เพื่มระดับสมาชิก
        if(memberType == MemberTypeWithDiscount.NONE){
            memberType = MemberTypeWithDiscount.SILVER;
        }else if(memberType == MemberTypeWithDiscount.SILVER){
            memberType =  MemberTypeWithDiscount.GOLD;
        }else if(memberType ==  MemberTypeWithDiscount.GOLD){
            memberType =  MemberTypeWithDiscount.PREMIUM;
        }
    }

    private void demoteMemberType(){ //ลดระดับสมาชิก
        if(memberType == MemberTypeWithDiscount.PREMIUM){
            memberType = MemberTypeWithDiscount.GOLD;
        }else if(memberType == MemberTypeWithDiscount.GOLD){
            memberType = MemberTypeWithDiscount.SILVER;
        }
    }

    public void showMembershipStatus(){ //แสดงสถานะสมาชิก
        System.out.printf("You are now %s %d%% discount on Product %d%% on service\n",memberType,(int)(memberType.getProductDiscount()*10),(int)(memberType.getServiceDiscount()*10));
    }

}
