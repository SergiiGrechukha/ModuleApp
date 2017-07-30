package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1416 {

    @Ignore    private SampleClass1417 sampleClass;

    public SampleClass1416(){
        sampleClass = new SampleClass1417();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}