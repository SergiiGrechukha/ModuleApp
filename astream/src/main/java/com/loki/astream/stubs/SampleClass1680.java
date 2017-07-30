package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1680 {

    @Ignore    private SampleClass1681 sampleClass;

    public SampleClass1680(){
        sampleClass = new SampleClass1681();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}