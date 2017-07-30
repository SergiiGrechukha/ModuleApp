package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass185 {

    @Ignore    private SampleClass186 sampleClass;

    public SampleClass185(){
        sampleClass = new SampleClass186();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}