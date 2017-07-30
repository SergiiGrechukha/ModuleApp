package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1916 {

    @Ignore    private SampleClass1917 sampleClass;

    public SampleClass1916(){
        sampleClass = new SampleClass1917();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}