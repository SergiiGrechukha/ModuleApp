package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1585 {

    @Ignore    private SampleClass1586 sampleClass;

    public SampleClass1585(){
        sampleClass = new SampleClass1586();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}