package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1648 {

    @Ignore    private SampleClass1649 sampleClass;

    public SampleClass1648(){
        sampleClass = new SampleClass1649();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}