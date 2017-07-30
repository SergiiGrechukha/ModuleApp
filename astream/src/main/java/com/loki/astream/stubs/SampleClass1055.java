package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1055 {

    @Ignore    private SampleClass1056 sampleClass;

    public SampleClass1055(){
        sampleClass = new SampleClass1056();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}