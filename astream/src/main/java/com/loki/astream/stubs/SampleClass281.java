package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass281 {

    @Ignore    private SampleClass282 sampleClass;

    public SampleClass281(){
        sampleClass = new SampleClass282();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}