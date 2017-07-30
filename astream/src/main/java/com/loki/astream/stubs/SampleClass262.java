package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass262 {

    @Ignore    private SampleClass263 sampleClass;

    public SampleClass262(){
        sampleClass = new SampleClass263();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}