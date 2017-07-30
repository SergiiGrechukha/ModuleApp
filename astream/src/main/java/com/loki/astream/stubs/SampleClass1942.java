package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1942 {

    @Ignore    private SampleClass1943 sampleClass;

    public SampleClass1942(){
        sampleClass = new SampleClass1943();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}