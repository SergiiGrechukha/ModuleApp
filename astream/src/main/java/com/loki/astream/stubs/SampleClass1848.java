package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1848 {

    @Ignore    private SampleClass1849 sampleClass;

    public SampleClass1848(){
        sampleClass = new SampleClass1849();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}