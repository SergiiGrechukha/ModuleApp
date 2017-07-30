package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass934 {

    @Ignore    private SampleClass935 sampleClass;

    public SampleClass934(){
        sampleClass = new SampleClass935();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}