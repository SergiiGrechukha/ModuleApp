package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1635 {

    @Ignore    private SampleClass1636 sampleClass;

    public SampleClass1635(){
        sampleClass = new SampleClass1636();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}