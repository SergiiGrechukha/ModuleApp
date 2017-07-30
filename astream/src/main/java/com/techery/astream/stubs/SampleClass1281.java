package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1281 {

    @Ignore    private SampleClass1282 sampleClass;

    public SampleClass1281(){
        sampleClass = new SampleClass1282();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}