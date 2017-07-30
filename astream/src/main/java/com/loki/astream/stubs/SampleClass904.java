package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass904 {

    @Ignore    private SampleClass905 sampleClass;

    public SampleClass904(){
        sampleClass = new SampleClass905();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}