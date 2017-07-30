package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass361 {

    @Ignore    private SampleClass362 sampleClass;

    public SampleClass361(){
        sampleClass = new SampleClass362();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}