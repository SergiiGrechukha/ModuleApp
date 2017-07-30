package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1228 {

    @Ignore    private SampleClass1229 sampleClass;

    public SampleClass1228(){
        sampleClass = new SampleClass1229();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}