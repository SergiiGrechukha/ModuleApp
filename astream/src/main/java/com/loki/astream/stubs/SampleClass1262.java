package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1262 {

    @Ignore    private SampleClass1263 sampleClass;

    public SampleClass1262(){
        sampleClass = new SampleClass1263();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}