package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1295 {

    @Ignore    private SampleClass1296 sampleClass;

    public SampleClass1295(){
        sampleClass = new SampleClass1296();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}