package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1474 {

    @Ignore    private SampleClass1475 sampleClass;

    public SampleClass1474(){
        sampleClass = new SampleClass1475();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}