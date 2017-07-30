package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass223 {

    @Ignore    private SampleClass224 sampleClass;

    public SampleClass223(){
        sampleClass = new SampleClass224();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}