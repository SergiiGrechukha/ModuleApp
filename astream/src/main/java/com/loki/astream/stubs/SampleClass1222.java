package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1222 {

    @Ignore    private SampleClass1223 sampleClass;

    public SampleClass1222(){
        sampleClass = new SampleClass1223();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}