package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass143 {

    @Ignore    private SampleClass144 sampleClass;

    public SampleClass143(){
        sampleClass = new SampleClass144();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}