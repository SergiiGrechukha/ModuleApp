package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass309 {

    @Ignore    private SampleClass310 sampleClass;

    public SampleClass309(){
        sampleClass = new SampleClass310();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}