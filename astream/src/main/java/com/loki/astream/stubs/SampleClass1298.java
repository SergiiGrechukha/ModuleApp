package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1298 {

    @Ignore    private SampleClass1299 sampleClass;

    public SampleClass1298(){
        sampleClass = new SampleClass1299();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}