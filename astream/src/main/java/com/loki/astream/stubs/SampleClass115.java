package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass115 {

    @Ignore    private SampleClass116 sampleClass;

    public SampleClass115(){
        sampleClass = new SampleClass116();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}