package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass225 {

    @Ignore    private SampleClass226 sampleClass;

    public SampleClass225(){
        sampleClass = new SampleClass226();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}