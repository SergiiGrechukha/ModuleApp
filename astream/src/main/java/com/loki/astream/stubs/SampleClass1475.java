package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1475 {

    @Ignore    private SampleClass1476 sampleClass;

    public SampleClass1475(){
        sampleClass = new SampleClass1476();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}