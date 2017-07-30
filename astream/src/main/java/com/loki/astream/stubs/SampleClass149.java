package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass149 {

    @Ignore    private SampleClass150 sampleClass;

    public SampleClass149(){
        sampleClass = new SampleClass150();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}