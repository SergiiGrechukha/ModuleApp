package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass771 {

    @Ignore    private SampleClass772 sampleClass;

    public SampleClass771(){
        sampleClass = new SampleClass772();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}