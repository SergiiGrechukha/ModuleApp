package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1556 {

    @Ignore    private SampleClass1557 sampleClass;

    public SampleClass1556(){
        sampleClass = new SampleClass1557();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}