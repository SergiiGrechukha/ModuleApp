package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass844 {

    @Ignore    private SampleClass845 sampleClass;

    public SampleClass844(){
        sampleClass = new SampleClass845();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}