package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1634 {

    @Ignore    private SampleClass1635 sampleClass;

    public SampleClass1634(){
        sampleClass = new SampleClass1635();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}