package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass702 {

    @Ignore    private SampleClass703 sampleClass;

    public SampleClass702(){
        sampleClass = new SampleClass703();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}