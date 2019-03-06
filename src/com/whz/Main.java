package com.whz;

import com.whz.Observer.Coder;
import com.whz.Observer.DevTechFrontier;
import com.whz.adapter.simple1.Volt220;
import com.whz.adapter.simple1.VoltAdapter;
import com.whz.adapter.simple2.VoltAdapter2;
import com.whz.bridge.LargeCoffee;
import com.whz.bridge.Ordinary;
import com.whz.bridge.SmallCoffee;
import com.whz.bridge.Sugar;
import com.whz.buider.ImageConfig;
import com.whz.command.ContreteCommand;
import com.whz.command.Invoker;
import com.whz.command.Receiver;
import com.whz.composite.Composite;
import com.whz.composite.Leaf;
import com.whz.decorator.simple1.ConcreteComponent;
import com.whz.decorator.simple1.ConcreteDecorator;
import com.whz.decorator.simple1.IComponent;
import com.whz.decorator.simple2.Boy;
import com.whz.decorator.simple2.CheapCloth;
import com.whz.decorator.simple2.ExpensiveCloth;
import com.whz.decorator.simple2.IPerson;
import com.whz.duty.simple1.ConcreteHandler1;
import com.whz.duty.simple1.ConcreteHandler2;
import com.whz.duty.simple2.*;
import com.whz.duty.simple3.*;
import com.whz.facade.MobileApi;
import com.whz.factory.car.AudiCarFactory;
import com.whz.factory.car.AudiQ3;
import com.whz.factory.car.AudiQ5;
import com.whz.factory.car.AudiQ7;
import com.whz.factory.io.DBHandler;
import com.whz.factory.io.FileHandler;
import com.whz.factory.io.IOFactory;
import com.whz.factory.io.XMLHandler;
import com.whz.factoryAbstract.factory.Q3Factory;
import com.whz.factoryAbstract.factory.Q7Factory;
import com.whz.flyweight.ITicket;
import com.whz.flyweight.TicketFactory;
import com.whz.iterator.Aggregate;
import com.whz.iterator.ConcreteAggregate;
import com.whz.iterator.Iterator;
import com.whz.mediator.ConcreteColleagueA;
import com.whz.mediator.ConcreteColleagueB;
import com.whz.mediator.ConcreteMediator;
import com.whz.memo.CallOfDuty;
import com.whz.memo.Caretaker;
import com.whz.prototype.WordDoc;
import com.whz.proxy.simple1.ProxySubject;
import com.whz.proxy.simple1.RealSubject;
import com.whz.proxy.simple2.ILawsuit;
import com.whz.proxy.simple2.Lawyer;
import com.whz.proxy.simple2.Xiaomin;
import com.whz.proxy.simple3.DynamicProxy;
import com.whz.singleton.*;
import com.whz.state.TvController;
import com.whz.strategy.BusStrategy;
import com.whz.strategy.SubWayStrtegy;
import com.whz.strategy.TranficCalculator;
import com.whz.template.CoderCoputer;
import com.whz.template.MilitaryComputer;
import com.whz.visitor.BusinessReport;
import com.whz.visitor.CEOVisitor;
import com.whz.visitor.CTOVisitor;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) throws Exception {
        prototype_test();
    }

    // ############################ 桥接模式 ############################

    /**
     * 桥接模式实例
     */
    private static void bridge_test_1() {
        //加糖
        Sugar sugar = new Sugar();
        //原味
        Ordinary ordinary = new Ordinary();

        //大杯加糖
        LargeCoffee largeCoffeeSugar = new LargeCoffee(sugar);
        largeCoffeeSugar.makeCoffee();
        //大杯原味
        LargeCoffee largeCoffeeOrdinary = new LargeCoffee(ordinary);
        largeCoffeeOrdinary.makeCoffee();

        //小杯加糖
        SmallCoffee smallCoffeeSugar = new SmallCoffee(sugar);
        smallCoffeeSugar.makeCoffee();
        //小杯原味
        SmallCoffee smallCoffeeOrdinary = new SmallCoffee(ordinary);
        smallCoffeeOrdinary.makeCoffee();
    }

    // ############################ 外观模式 ############################

    /**
     * 外观模式实例
     */
    private static void facade_test_1() {
        MobileApi mobileApi = new MobileApi();
        //拍照
        mobileApi.takePicture();
        //视频聊天
        mobileApi.videoChat();
    }
    // ############################ 享元模式 ############################

    /**
     * 享元模式实例
     */
    private static void flyweight_test_1() {
        ITicket ticket1 = TicketFactory.getTicket("北京", "上海");
        ticket1.showTicketInfo("上铺");

        ITicket ticket2 = TicketFactory.getTicket("北京", "上海");
        ticket2.showTicketInfo("下铺");

        ITicket ticket3 = TicketFactory.getTicket("北京", "上海");
        ticket3.showTicketInfo("坐票");
    }

    // ############################ 装饰模式 ###########################

    /**
     * 装饰模式实例2
     */
    private static void decorator_test_2() {
        IPerson boy = new Boy();

        ExpensiveCloth expensiveCloth = new ExpensiveCloth(boy);
        expensiveCloth.dressed();

        CheapCloth cheapCloth = new CheapCloth(boy);
        cheapCloth.dressed();
    }

    /**
     * 装饰模式实例1
     */
    private static void decorator_test_1() {
        IComponent component = new ConcreteComponent();

        ConcreteDecorator decorator = new ConcreteDecorator(component);
        decorator.operate();
    }

    // ############################ 适配器模式 ##########################

    /**
     * 对象适配器实例
     */
    private static void adapter_test_2() {
        Volt220 volt220 = new Volt220();

        VoltAdapter2 adapter = new VoltAdapter2(volt220);
        int volt5 = adapter.getVolt5();
        Sysout.getInstance().print(volt5);
    }


    /**
     * 类适配器实例
     */
    private static void adapter_test_1() {
        VoltAdapter adapter = new VoltAdapter();
        int volt5 = adapter.getVolt5();
        Sysout.getInstance().print(volt5);
    }

    // ############################ 组合模式 ############################

    /**
     * 组合模式实例
     */
    private static void composite_test_1() {
        Composite root = new Composite("root");

        Composite branch1 = new Composite("branch1");
        Composite branch2 = new Composite("branch2");

        Leaf leaf1 = new Leaf("Leaf1");
        Leaf leaf2 = new Leaf("Leaf2");

        branch1.addChild(leaf1);
        branch2.addChild(leaf2);

        root.addChild(branch1);
        root.addChild(branch2);

        root.doSomething();
    }

    // ############################ 代理模式 ############################

    /**
     * 代理模式实例3
     */
    private static void proxy_test_3() {
        ILawsuit xiaomin = new Xiaomin();
        //构造一个动态代理
        DynamicProxy proxy = new DynamicProxy(xiaomin);
        //获取被代理类小明的classloader
        ClassLoader classLoader = xiaomin.getClass().getClassLoader();
        //动态构造一个代理者律师
        ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance(classLoader, new Class[]{ILawsuit.class}, proxy);

        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }

    /**
     * 代理模式实例2
     */
    private static void proxy_test_2() {
        ILawsuit xiaomin = new Xiaomin();

        Lawyer lawyer = new Lawyer(xiaomin);
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }

    /**
     * 代理模式实例1
     */
    private static void proxy_test_1() {
        RealSubject realSubject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(realSubject);
        proxySubject.visit();
    }

    // ############################ 中介者模式 ###########################

    /**
     * 中介者模式实例
     */
    private static void mediator_test_1() {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);

        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);
        mediator.method();
    }

    // ############################ 访问者模式 ###########################

    /**
     * 访问者模式实例
     */
    private static void visitor_test_1() {
        BusinessReport report = new BusinessReport();
        Sysout.getInstance().print("---------- CEO ------------");
        report.showReport(new CEOVisitor());

        Sysout.getInstance().print("\n");

        Sysout.getInstance().print("---------- CTO ------------");
        report.showReport(new CTOVisitor());
    }


    // ############################ 模版模式 ############################

    /**
     * 模版模式实例
     */
    private static void template_test_1() {
        CoderCoputer coderCoputer = new CoderCoputer();
        coderCoputer.startUp();

        MilitaryComputer militaryComputer = new MilitaryComputer();
        militaryComputer.startUp();
    }


    // ############################ 迭代器模式 ############################

    /**
     * 迭代器模式实例
     */
    private static void iterator_pattern_test_1() {
        Aggregate<String> aggregate = new ConcreteAggregate<String>();
        aggregate.add("1");
        aggregate.add("2");
        aggregate.add("3");
        aggregate.add("4");
        aggregate.add("5");

        Iterator<String> iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            Sysout.getInstance().print(iterator.next());
        }
    }

    // ############################ 备忘录模式 ############################

    /**
     * 备忘录模式实例
     */
    private static void memoto_test_1() {
        //创建游戏对象
        CallOfDuty game = new CallOfDuty();
        //玩游戏
        game.play();
        //创建存档
        Caretaker caretaker = new Caretaker();
        //存档
        caretaker.archive(game.createMemoto());
        //重新开始游戏
        CallOfDuty resotreGanme = new CallOfDuty();
        //恢复游戏
        resotreGanme.restore(caretaker.getmemoto());
    }

    // ############################ 观察者模式 ############################

    /**
     * 观察者模式实例
     */
    private static void observer_test_1() {
        //被观察者
        DevTechFrontier devTechFrontier = new DevTechFrontier();
        //观察者
        Coder code1 = new Coder("Code1");
        Coder code2 = new Coder("Code2");
        Coder code3 = new Coder("Code3");
        //将观察者注册到可观察对象到观察者列表中
        devTechFrontier.addObserver(code1);
        devTechFrontier.addObserver(code2);
        devTechFrontier.addObserver(code3);
        //发布消息
        devTechFrontier.postNewPublication("新的一期开发技术，更新了！");

    }

    // ############################ 命令模式 ############################

    /**
     * 命令模式实例
     */
    private static void command_test_1() {
        Receiver receiver = new Receiver();
        ContreteCommand command = new ContreteCommand(receiver);
        Invoker invoker = new Invoker(command);

        invoker.action();
    }


    // ############################ 责任链模式 ############################

    /**
     * 责任链实例3
     */
    private static void iterator_test_3() {
        Leader group = new Group();
        Leader director = new Director();
        Leader manger = new Manger();
        Leader boss = new Boss();

        group.mNextLeader = director;
        director.mNextLeader = manger;
        manger.mNextLeader = boss;

        group.handleRequest(8500);
    }

    /**
     * 责任链实例2
     */
    private static void iterator_test_2() {
        AbstractHandler handle1 = new Handle1();
        AbstractHandler handle2 = new Handle2();
        AbstractHandler handle3 = new Handle3();

        handle1.mNexthandler = handle2;
        handle2.mNexthandler = handle3;

        AbstractRequest request1 = new Request1("request1");
        AbstractRequest request2 = new Request2("request2");
        AbstractRequest request3 = new Request3("request3");

        handle1.handleRequest(request1);
        handle2.handleRequest(request2);
        handle3.handleRequest(request3);
    }

    /**
     * 责任链实例1
     */
    private static void iterator_test_1() {
        ConcreteHandler1 concreteHandler1 = new ConcreteHandler1();
        ConcreteHandler2 concreteHandler2 = new ConcreteHandler2();

        concreteHandler1.successor = concreteHandler2;
        concreteHandler2.successor = concreteHandler1;

        concreteHandler1.handRequest("ConcreteHandler2");
    }


    // ############################ 状态模式 ############################

    /**
     * 状态模式实例
     */
    private static void state_test() {
        TvController controller = new TvController();
        controller.powerOn();
        controller.nextChannel();
        controller.turnDown();

        controller.powerOff();
        controller.nextChannel();
    }


    // ############################ 策略模式 ############################

    /**
     * 策略模式实例
     */
    private static void strategy_test() {
        TranficCalculator tranfic = new TranficCalculator();

        String bus_price = tranfic.setStrategy(new BusStrategy()).getCalculatorPrice(1);
        Sysout.getInstance().print(bus_price);

        String subway_result = tranfic.setStrategy(new SubWayStrtegy()).getCalculatorPrice(2);
        Sysout.getInstance().print(subway_result);
    }

    // ############################ 抽象工厂模式 ############################

    /**
     * 抽象工厂实例
     */
    private static void factory_abstract_test() {
        Q3Factory q3 = new Q3Factory();
        q3.createTire().tire();
        q3.createBrake().brake();
        q3.createEngine().engine();

        Q7Factory q7 = new Q7Factory();
        q7.createTire().tire();
        q7.createBrake().brake();
        q7.createEngine().engine();
    }


    // ############################ 工厂模式 ############################

    /**
     * IO操作工厂实例
     */
    private static void factory_IO_test() {
        //创建工厂
        IOFactory factory = new IOFactory();

        FileHandler file = factory.createIOHandler(FileHandler.class);
        String file_result = file.query(1);
        Sysout.getInstance().print(file_result);

        XMLHandler xml = factory.createIOHandler(XMLHandler.class);
        String xml_result = xml.query(2);
        Sysout.getInstance().print(xml_result);

        DBHandler db = factory.createIOHandler(DBHandler.class);
        String db_result = db.query(3);
        Sysout.getInstance().print(db_result);
    }

    /**
     * 汽车工厂实例
     */
    private static void factory_test() {
        //创建工厂
        AudiCarFactory factory = new AudiCarFactory();

        //生产Q3
        AudiQ3 q3 = factory.createAudiCar(AudiQ3.class);
        q3.drive();
        q3.selfNavigation();

        //生产Q5
        AudiQ5 q5 = factory.createAudiCar(AudiQ5.class);
        q5.drive();
        q5.selfNavigation();

        //生产Q7
        AudiQ7 q7 = factory.createAudiCar(AudiQ7.class);
        q7.drive();
        q7.selfNavigation();
    }

    // ############################ 原型模式 ############################

    /**
     * 浅拷贝。备注：深拷贝object被保护了
     */
    private static void prototype_test() throws CloneNotSupportedException {
        WordDoc originDoc = new WordDoc();
        originDoc.setText("text1");
        originDoc.setImags("pic1");
        originDoc.setImags("pic2");
        originDoc.showDoc();

        WordDoc cloneDoc = (WordDoc) originDoc.clone();
        cloneDoc.showDoc();

        cloneDoc.setText("textClone");
        cloneDoc.setImags("pic3");
        cloneDoc.showDoc();

        originDoc.showDoc();

    }

    // ############################ buider模式 ############################

    /**
     * buider模式
     */
    private static void buider_test() {
        ImageConfig result = ImageConfig.builder().setHeigth(10).setWidth(10).setName("buider");
        Sysout.getInstance().print(result.toString());
    }

    // ############################ 单例模式 ############################

    /**
     * 饿汉式
     */
    private static void singleton1_test() {
        String result = Singleton1.getInstance().test();
        Sysout.getInstance().print(result);
    }

    /**
     * 懒汉式
     */
    private static void singleton2_test() {
        String result = Singleton2.getInstance().test();
        Sysout.getInstance().print(result);
    }

    /**
     * Double Check Lock (DCL)
     */
    private static void singleton3_test() {
        String result = Singleton3.getInstance().test();
        Sysout.getInstance().print(result);
    }

    /**
     * 静态内部类
     */
    private static void singleton4_test() {
        String result = Singleton4.getInstance().test();
        Sysout.getInstance().print(result);
    }

    /**
     * 枚举单例
     */
    private static void singleton5_test() {
        String result = Singleton5.getInstance.test();
        Sysout.getInstance().print(result);
    }

    /**
     * 容器单例
     */
    private static void singleton6_test() {
        Singleton6.registerService("test", "singleton6");
        String result = (String) Singleton6.getService("test");
        Sysout.getInstance().print(result);
    }
}
