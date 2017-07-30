package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1641 {

    @Ignore    private SampleClass1642 sampleClass;

    public SampleClass1641(){
        sampleClass = new SampleClass1642();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}