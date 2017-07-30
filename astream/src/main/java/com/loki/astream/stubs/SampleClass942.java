package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass942 {

    @Ignore    private SampleClass943 sampleClass;

    public SampleClass942(){
        sampleClass = new SampleClass943();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}