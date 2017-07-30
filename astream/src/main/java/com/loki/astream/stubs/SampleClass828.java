package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass828 {

    @Ignore    private SampleClass829 sampleClass;

    public SampleClass828(){
        sampleClass = new SampleClass829();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}