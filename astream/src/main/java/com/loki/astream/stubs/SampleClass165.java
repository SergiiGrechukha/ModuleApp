package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass165 {

    @Ignore    private SampleClass166 sampleClass;

    public SampleClass165(){
        sampleClass = new SampleClass166();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}