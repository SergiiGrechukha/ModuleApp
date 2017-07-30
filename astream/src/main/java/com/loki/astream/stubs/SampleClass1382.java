package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1382 {

    @Ignore    private SampleClass1383 sampleClass;

    public SampleClass1382(){
        sampleClass = new SampleClass1383();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}