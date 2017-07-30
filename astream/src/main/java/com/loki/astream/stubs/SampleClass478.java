package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass478 {

    @Ignore    private SampleClass479 sampleClass;

    public SampleClass478(){
        sampleClass = new SampleClass479();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}