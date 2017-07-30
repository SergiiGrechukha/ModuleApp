package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1757 {

    @Ignore    private SampleClass1758 sampleClass;

    public SampleClass1757(){
        sampleClass = new SampleClass1758();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}