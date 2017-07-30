package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass908 {

    @Ignore    private SampleClass909 sampleClass;

    public SampleClass908(){
        sampleClass = new SampleClass909();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}