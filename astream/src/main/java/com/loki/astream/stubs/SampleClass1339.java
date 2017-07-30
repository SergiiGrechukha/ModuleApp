package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1339 {

    @Ignore    private SampleClass1340 sampleClass;

    public SampleClass1339(){
        sampleClass = new SampleClass1340();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}