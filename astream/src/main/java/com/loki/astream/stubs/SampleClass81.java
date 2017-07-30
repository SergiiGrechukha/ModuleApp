package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass81 {

    @Ignore    private SampleClass82 sampleClass;

    public SampleClass81(){
        sampleClass = new SampleClass82();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}