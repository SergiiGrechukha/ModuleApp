package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass306 {

    @Ignore    private SampleClass307 sampleClass;

    public SampleClass306(){
        sampleClass = new SampleClass307();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}